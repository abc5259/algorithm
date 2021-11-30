function solution(num) {
  let answer = "";
  let cnt = 0;
  for (let i = 0; i < num.length; i++) {
    cnt = 0;
    arr[i] = String(arr[i]).split("").reverse().join("") * 1;
    for (let j = 2; j <= parseInt(Math.sqrt(arr[i])); j++) {
      if (arr[i] === 1 || arr[i] % j === 0) cnt++;
    }
    if (arr[i] !== 1 && cnt === 0) answer += arr[i] + " ";
  }
  return answer;
}

let arr = [32, 55, 62, 20, 250, 370, 200, 30, 100];
console.log(solution(arr));
