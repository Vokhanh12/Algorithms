void main() {
  print('hello');

  var nums = [2, 7, 11, 15];

  print(twoSum(nums, 17));
}

List<int> twoSum(List<int> nums, int target) {
  List<int> sum = [0, 0];
  Recursive(nums.length - 1, nums, target, sum);

  return sum;
}

void Recursive(int number, List<int> nums, int target, List<int> sum) {
  var arr_run = nums[number];

  List<int> sum = [0, 0, 0, 0];

  for (int i = 0; i <= number; i++) {
    sum[i] = arr_run * nums[i];

    if (number == -1)
      return;
    else if (sum[i] == target) {
      sum[0] = i;
      sum[1] = number;
      return;
    }
  }
}
