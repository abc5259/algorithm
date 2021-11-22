function solution(s) {
  let answer = [];
  for (let i = 0; i < s.length; i++) {
    if (answer.indexOf(s[i]) === -1) answer.push(s[i]);
  }
  return answer.join("");
}
console.log(solution("ksekkset"));
// k
// s e k 발갼 k없세자
