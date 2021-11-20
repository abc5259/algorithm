function solution(n, lost, reserve) {
  var answer = 0;
  const studentsArray = [];
  class Students {
    constructor(number, spare) {
      this.number = number;
      this.spare = spare;
    }
  }
  for (let i = 0; i < n; i++) {
    studentsArray.push(new Students(i + 1, 1));
  }
  studentsArray.forEach((student, i) => {
    for (let j = 0; j < reserve.length; j++) {
      if (student.number === reserve[j]) student.spare++;
    }
  });
  studentsArray.forEach((student, i) => {
    for (let j = 0; j < lost.length; j++) {
      if (student.number === lost[j]) student.spare--;
    }
  });
  studentsArray.forEach((student, i) => {
    console.log(studentsArray[i + 1]);
    if (
      studentsArray[i + 1] &&
      student.spare === 0 &&
      studentsArray[i + 1].spare > 1
    ) {
      student.spare = 1;
      studentsArray[i + 1].spare--;
    }
    if (
      studentsArray[i - 1] &&
      student.spare === 0 &&
      studentsArray[i - 1].spare > 1
    ) {
      student.spare = 1;
      studentsArray[i - 1].spare--;
    }
  });
  studentsArray.forEach((student, i) => {
    if (student.spare > 0) answer++;
  });
  console.log(studentsArray);
  return answer;
}

console.log(solution(3, [3], [1]));
