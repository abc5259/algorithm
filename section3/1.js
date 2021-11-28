function solution(s) {
  let answer = "Yes";
  const arrayS = s.split("");
  const reverseS = [...arrayS].reverse();
  arrayS.forEach((v, i) => {
    if (v !== reverseS[i].toUpperCase() && v !== reverseS[i].toLowerCase())
      answer = "No";
  });
  return answer;
}

function solution2(s) {
  let answer = "Yes";
  s = s.toLowerCase();
  const n = s.length;
  for (let i = 0; i < Math.floor(n / 2); i++) {
    if (s[i] !== s[n - i - 1]) answer = "NO";
  }
  return answer;
}

function solution3(s) {
  let answer = "Yes";
  s = s.toLowerCase();
  if (s.split("").reverse().join("") !== s) answer = "NO";
  return answer;
}

let str = "goooG";
console.log(solution3(str));
