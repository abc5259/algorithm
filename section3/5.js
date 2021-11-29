function solution(s) {
  let answer = [];
  let sum = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === s[i + 1]) {
      sum += 1;
    } else {
      if (sum === 0) answer.push(s[i]);
      else {
        answer.push(`${s[i]}${sum + 1}`);
        sum = 0;
      }
    }
  }
  return answer.join("");
}

let str = "KKHSSSSSSSE";
console.log(solution(str));
