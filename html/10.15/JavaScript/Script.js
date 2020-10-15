var s;

s = 100;
document.write(s + "<br>");

s = "홍길동";
document.write(s + "<br>");

var x, y;
var input;

input = prompt("정수를 입력하시오", "정수로");
x = parselnt(input);

input = prompt("정수를 입력하시오", "정수로");
y = parselnt(input);

document.write(x + y + "<br>");
