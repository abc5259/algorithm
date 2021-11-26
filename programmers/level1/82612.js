function solution(price, money, count) {
  let answer = 0;
  let total = 0;
  // 1 ~ count까지
  for (let i = 1; i < count + 1; i++) {
    total += price * i;
  }
  // 부족한 금액 return
  //금액이 부족하지 않으면 0을 return
  answer = total > money ? total - money : 0;
  return answer;
}
//놀이기구의 원래 이용료는 price원 인데, 놀이기구를 count번 째 이용한다면 원래 이용료의 count배를 받음
// price: 3 money: 20 count: 4
console.log(solution(3, 20, 4));
