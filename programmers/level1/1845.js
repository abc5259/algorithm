function solution(nums) {
  let answer = 0;
  const pickArray = [];
  //고르는 폰켓몬 마리 수
  const pick = nums.length / 2;
  //중복된 num은 빼고 pickArray에 들어감
  nums.forEach(num => {
    if (pickArray.indexOf(num) === -1) pickArray.push(num);
  });
  // 폰켓몬의 종류가 고르는 폰켓몬 수 보다 많으면 answer = pick
  // 폰켓몬의 종류가 고르는 폰켓몬 수 보다 적으면 answer = 폰켓몬의 종류
  answer = pickArray.length >= pick ? pick : pickArray.length;
  return answer;
}

// N 마리의 폰켓몬 중에서 N/2마리
// 고를 수 있는 종류 개수의 최댓값
//nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
console.log(solution([3, 1, 2, 3])); //2마리를 고르는데 종류는 3종류나 있음
// [3,3,3,2,2,2] 3마리 뽑아야라는데 종류는 2종류 밖에 없음
// 이 2종류 중에는 무조건 반복되는 폰켓몬이 있음
