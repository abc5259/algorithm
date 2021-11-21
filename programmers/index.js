function solution(answers) {
  const answer = [];
  // 수포자 3인방 객체로 두기
  const n1 = {
    number: 1, //몇번 수포자 인지
    sol: 0, // 몇 문제를 풀었는지 초기값 0
    answer: [1, 2, 3, 4, 5], //수포자의 찍는 패턴
  };
  const n2 = {
    number: 2,
    sol: 0,
    answer: [2, 1, 2, 3, 2, 4, 2, 5],
  };
  const n3 = {
    number: 3,
    sol: 0,
    answer: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
  };
  //3명의 수포자를 배열에 담는다.
  const students = [n1, n2, n3];
  //각각의 수포자들의 정답들을 실제 정답(answers)과 비교해서 맞으면 위에 설정해둔 sol에 +1을 해준다.
  answers.forEach((answer, i) => {
    //  수포자들의 answer은 패턴이다. 즉 길이가 한정되어있다는 말. 근데 answers(실제 정답)의 길이는 수포자들의 answer의 길이보다 클 수 있음.
    if (answer === n1.answer[i % n1.answer.length]) n1.sol++;
    if (answer === n2.answer[i % n2.answer.length]) n2.sol++;
    if (answer === n3.answer[i % n3.answer.length]) n3.sol++;
  });
  console.log(students);
  //최댓값 구하기
  const max = Math.max(n1.sol, n2.sol, n3.sol);
  students.forEach(student => {
    if (student.sol === max) answer.push(student.number);
  });
  return answer;
}

console.log(solution([1, 2, 3, 4, 5]));
