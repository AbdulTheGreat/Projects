const defaultValue = 0;
let currentResult = defaultValue;
let dataEntries = [];

function mathCalculationUsed (operator, originalResult, finalResult){
 const clacDescription = `${originalResult} ${operator} ${finalResult} `
 outputResult(currentResult, clacDescription)

}

function getUserInput(){
    return parseInt(userInput.value);
}

function writeToLog(operationID, previousResult, newNumber, currentResult){
    const logEntry={
        operation: operationID,
        firstNumber: previousResult,
        secondNumber: newNumber,
        result: currentResult,
    };
    dataEntries.push(logEntry);
    console.log(dataEntries);
}

function add(){
    const userNumber = getUserInput();
    const previousResult = currentResult;
    currentResult += userNumber;
    mathCalculationUsed("+", previousResult, userNumber);
    writeToLog("Add", previousResult, userNumber, currentResult);
}

function subtract(){
    const userNumber = getUserInput();
    const previousResult = currentResult;
    currentResult -= userNumber;
    mathCalculationUsed("-", previousResult, userNumber);
    writeToLog("Subtract", previousResult, userNumber, currentResult);

}

function multiply(){
    const userNumber = getUserInput();
    const previousResult = currentResult;
    currentResult *= userNumber;
    mathCalculationUsed("*", previousResult, userNumber);
    writeToLog("Multiply", previousResult, userNumber, currentResult);
}

function divide(){
    const userNumber = getUserInput();
    const previousResult = currentResult;
    currentResult /= userNumber;
    mathCalculationUsed("/", previousResult, userNumber);
    writeToLog("divide", previousResult, userNumber, currentResult);
}

addBtn.addEventListener("click", add);
subtractBtn.addEventListener("click", subtract);
multiplyBtn.addEventListener("click", multiply);
divideBtn.addEventListener("click", divide);
