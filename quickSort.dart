void main() {
  List<int> array = [8, 2, 4, 7, 1, 3, 9, 6, 5];

  quickSort(array, 0, array.length - 1);

  array.forEach((element) {
    print(element);
  });
}

void quickSort(List<int> array, int start, int end) {
  if (start >= end) return;

  int privot_index = getPrivot(array, start, end);
  quickSort(array, start, privot_index - 1);
  quickSort(array, privot_index + 1, end);
}

int getPrivot(List<int> array, int start, end) {
  int i = start - 1;
  int privot = array[end];

  for (int j = start; j < end; j++) {
    if (array[j] < privot) {
      i++;

      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

  i++;
  int temp = array[i];
  array[i] = array[end];
  array[end] = temp;

  return i;
}
