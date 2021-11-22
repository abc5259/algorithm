function solution(s) {
  let answer;
  // for (let i = 0; i < s.length; i++) {
  //   if (answer.indexOf(s[i]) === -1) answer.push(s[i]);
  // }
  answer = s.filter((str, i) => i === s.indexOf(str));
  return answer;
}
let str = ["good", "time", "good", "time", "student"];
console.log(solution(str));
