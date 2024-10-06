var buttonColors = ["red", "blue", "green", "yellow"]; // Declare array of colors
var gamePattern = []; // Array to store the game pattern
var userClickedPattern = []; // Array to store the user's clicked pattern

var started = false; // Boolean to track if the game has started
var level = 0; // Variable to track the level

// Function to generate the next sequence and play the sound
function nextSequence() {
    level++; // Increment the level
    $("#level-title").text("Level " + level); // Update the h1 title with the current level

    let randomNumber = Math.floor(Math.random() * 4); // Generate a random number
    let randomChosenColor = buttonColors[randomNumber]; // Choose a color based on the random number
    gamePattern.push(randomChosenColor); // Add the color to the game pattern

    // Animate the button
    $("#" + randomChosenColor).fadeOut(100).fadeIn(100);

    // Play sound for the chosen color
    playSound(randomChosenColor);

    // Reset userClickedPattern for the next round
    userClickedPattern = [];
}

// Click event handler for buttons with the class 'btn'
$(".btn").on("click", function() {
    // Get the id of the clicked button
    let userChosenColor = $(this).attr("id");

    // Add the clicked color to the userClickedPattern array
    userClickedPattern.push(userChosenColor);

    // Play sound for the clicked color
    playSound(userChosenColor);

    // Animate the button press
    animatePress(userChosenColor);

    // Check the user's answer after each click
    checkAnswer(userClickedPattern.length - 1);
});

// Function to play sound based on the name (color)
function playSound(name) {
    var sound = new Audio("sounds/" + name + ".mp3"); // Construct the sound file path
    sound.play(); // Play the sound
}

// Function to animate the button press
function animatePress(currentColor) {
    $("#" + currentColor).addClass("pressed"); // Add the 'pressed' class

    // Remove the 'pressed' class after 100 milliseconds
    setTimeout(function() {
        $("#" + currentColor).removeClass("pressed");
    }, 100);
}

// Detect when any key is pressed to start the game
$(document).keypress(function() {
    if (!started) {
        $("#level-title").text("Level " + level); // Change the h1 title to "Level 0"
        nextSequence(); // Call nextSequence to start the game
        started = true; // Set started to true to prevent calling nextSequence again
    }
});

// Function to check the user's answer
function checkAnswer(currentLevel) {
    // Check if the most recent user click matches the game pattern
    if (userClickedPattern[currentLevel] === gamePattern[currentLevel]) {
        console.log("Success");

        // Check if the user has completed the current sequence
        if (userClickedPattern.length === gamePattern.length) {
            // Call nextSequence after a delay for the next level
            setTimeout(function() {
                nextSequence();
            }, 1000);
        }
    } else {
        console.log("Wrong");
        $("#level-title").text("Game Over, Press Any Key to Restart");

        // Optionally, play a "wrong" sound here
        playSound("wrong");

        // Restart the game
        startOver();
    }
}

// Function to restart the game
function startOver() {
    level = 0;
    gamePattern = [];
    started = false;
}
