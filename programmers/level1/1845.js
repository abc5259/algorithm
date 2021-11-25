function solution(nums) {
  var answer = 0;
  const pickArray = [];
  const pick = nums.length / 2;
  nums.forEach(num => {
    if (pickArray.indexOf(num) === -1) pickArray.push(num);
  });
  answer = pickArray.length >= pick ? pick : pickArray.length;
  return answer;
}
