function solution(s) {
  let answer;
  const str = s.split("");
  if (str.length % 2 !== 0) answer = str[Math.floor(str.length / 2)];
  else
    answer =
      str[Math.floor(str.length / 2 - 1)] + str[Math.floor(str.length / 2)];
  return answer;
}
console.log(solution("good"));

function solution2(s) {
  let answer;
  let mid = Math.floor(s.length / 2);
  if (s.length % 2 !== 0) answer = s.substr(mid, 1);
  else answer = s.substr(mid - 1, 2);
  return answer;
}
console.log(solution2("studys"));
