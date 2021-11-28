function solution(s) {
  let answer;
  s = s.toLowerCase().replace(/[a-z]/g, "");
  if (s[0] === "0") answer = s.slice(1, s.length);
  else answer = s;
  return answer;
}

let str = "g0en2T0s8eSoft";
console.log(solution(str));
