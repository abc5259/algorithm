function solution(s) {
  let answer = "YES";
  const n = s.length / 2;
  const str = s.toLowerCase();
  for (let i = 0; i < Math.floor(n); i++) {
    if (
      96 < s[i].charCodeAt &&
      123 > s[i].charCodeAt &&
      s[i] !== str[n - i - 1]
    )
      answer = "NO";
  }
  return answer;
}

function solution2(s) {
  let answer = "YES";
  s = s.toLowerCase().replace(/[^a-z]/g, "");
  if (s !== s.split("").reverse().join("")) answer = "NO";
  return answer;
}

let str = "found7, time: study; Yduts; emit, 7Dnuof";
console.log(solution2(str));
