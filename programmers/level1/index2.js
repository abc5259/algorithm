function solution(n, lost, reserve) {
  let answer = 0;
  const studentsArray = [];
  class Student {
    constructor(number, count) {
      this.number = number; //학생의 번호
      this.count = count; //체육복의 개수
    }
  }
  for (let i = 0; i < n; i++) {
    studentsArray.push(new Student(i + 1, 1));
  }
  // console.log(studentsArray);
  reserve.forEach((student, i) => {
    studentsArray[student - 1].count++;
  });
  // console.log(studentsArray);
  lost.forEach((student, i) => {
    studentsArray[student - 1].count--;
  });
  // console.log(studentsArray);
  //체육복의 개수가 0인 학생들 을 찾고 그 학생의 이전 이후의 학생이 1벌 이상 가지고 있으면 체육복을 준다.
  studentsArray.forEach((student, i) => {
    if (
      studentsArray[i - 1] &&
      student.count === 0 &&
      studentsArray[i - 1].count > 1
    ) {
      student.count = 1;
      studentsArray[i - 1].count--;
    } else if (
      studentsArray[i + 1] &&
      student.count === 0 &&
      studentsArray[i + 1].count > 1
    ) {
      student.count = 1;
      studentsArray[i + 1].count--;
    }
  });
  console.log(studentsArray);
  studentsArray.forEach((student, i) => {
    if (student.count > 0) answer++;
  });
  return answer;
}

solution(5, [2, 4], [1, 3, 5]);
