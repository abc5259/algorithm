function solution(arr) {
  let answer = "";
  const arrSort = [...arr];
  arrSort.sort((a, b) => b - a);
  arr.forEach(a => (answer += `${arrSort.indexOf(a) + 1} `));
  return answer;
}

let arr = [87, 89, 92, 92, 76];
console.log(solution(arr));
