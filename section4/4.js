function solution(m, product) {
  let answer = 0;
  const arr = [];
  product.forEach((item, i) => {
    let total = item[0] + item[1];
    let total2 = item[0] / 2 + item[1];
    arr[i] = [total, total2];
  });
  arr.sort((a, b) => a[0] - b[0]);
  arr.forEach(item => {
    if (m < item[0] && m >= item[1]) {
      m = m - item[1];
      answer++;
      console.log(m);
      return;
    }
    if (m < item[0] && m < item[1]) return;
    m = m - item[0];
    console.log(m);
    answer++;
  });
  return answer;
}

function solution2(m, product) {
  let answer = 0;
  let max = Number.MIN_SAFE_INTEGER;
  let money;
  product.sort((a, b) => a[0] + a[1] - (b[0] + b[1]));
  console.log(product);
  for (let i = 0; i < product.length; i++) {
    answer = 0;
    money = m;
    money -= product[i][0] / 2 + product[i][1];
    answer++;
    for (let j = 0; j < product.length; j++) {
      if (i === j || money < product[j][0] + product[j][1]) continue;
      money -= product[j][0] + product[j][1];
      answer++;
    }
    if (max < answer) max = answer;
  }
  return max;
}
//가격 배송비
//50%할인쿠폰 1개 배송비 포함 x
//최대 몇명의 선물 살수 있는지
let arr = [
  [8, 6],
  [2, 2],
  [4, 3],
  [4, 5],
  [12, 1],
];

console.log(solution(41, arr));
