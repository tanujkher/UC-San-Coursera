// taking input from console
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    terminal: false
});

process.stdin.setEncoding('utf8');
rl.on('line', readLine);

function readLine(line) {
    console.log(fib(parseInt(line, 10)));
    process.exit();
}

function fib(n) {
    let a = 0;
    let b = 1;
    for(let i = 1; i <= n; i++){
        let temp = a + b;
        a = b;
        b = temp;
    }
    return b
}

module.exports = fib;
