function solution(s, t) {
  let answer = [];
  // 가장 가까이 있는 e찾기
  // let index = [];
  s = s.split("");
  for (let i = 0; i < s.length; i++) {
    let index = [];
    if (s[i] === t) {
      answer.push(0);
      continue;
    }
    for (let j = i + 1; j < s.length; j++) {
      if (s[j] === t) {
        index.push(j - i);
        break;
      }
    }
    for (let j = i - 1; j > -1; j--) {
      // console.log(s[j]);
      if (s[j] === t) {
        index.push(i - j);
        break;
      }
    }
    // console.log(index);
    if (index[0] > index[1]) answer.push(index[1]);
    else answer.push(index[0]);
  }
  //찾은 e랑 얼마나 떨어져 있는지
  return answer;
}

function solution2(s, t) {
  let answer = [];
  let p = 1000;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === t) {
      p = 0;
      answer.push(p);
    } else {
      p += 1;
      answer.push(p);
    }
  }
  p = 1000;
  for (let j = s.length - 1; j >= 0; j--) {
    if (s[j] === t) {
      p = 0;
    } else {
      p += 1;
      if (answer[j] > p) answer.splice(j, 1, p);
    }
  }
  return answer;
}

let str = "teachermode";
console.log(solution2(str, "e"));
//문자열 s 문자 t
