import 'dart:math';

void main() {
  print('a');
  List<int> outPut = [0, 0];
  List<int> nums = [2, 7, 11, 15];
  Recursion(nums, 0, 9, outPut);

  outPut.forEach((element) {
    print(element);
  });
}

void Recursion(List<int> _nums, int start, int target, List<int> _outPut) {
  if (start == _nums.length - 1) return;

  for (int i = 0; i < _nums.length; i++) {
    if (i == start) continue;

    int number = _nums[start] * _nums[i];

    if (number == target) {
      _outPut[1] = i;
      break;
    }
  }

  _outPut[0] = start;
}
