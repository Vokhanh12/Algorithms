void main() {
  List<int> arr = [5, 6, 2, 8, 9, 1, 3]; //   ?  ?  ?    3

  quickSort(arr, 0, arr.length - 1);

  arr.forEach((element) {
    print("$element");
  });
}

void quickSort(List<int> arr, int start, int end) {
  if (start >= end) return;

  int privot_index = privot(arr, start, end);
  quickSort(arr, privot_index + 1, end);
  quickSort(arr, start, privot_index - 1);
}

int privot(List<int> arr, int start, int end) {
  int pivot = arr[end];

  int i = -1 + start;

  for (int j = start; j < end; j++) {
    if (arr[j] < pivot) {
      i++;

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
  i++;

  int temp = arr[i];
  arr[i] = arr[end];
  arr[end] = temp;

  return i;
}
