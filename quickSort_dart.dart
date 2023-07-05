void main() {
  var arr = [8, 2, 4, 7, 1, 3, 9, 6, 5];

  quickSort(arr, 0, arr.length - 1);

  arr.forEach((element) => print(element));
}

void quickSort(List<int> array, var start, var end) {
  if (end <= start) return;

  var partitionIndex = partition(array, start, end);

  quickSort(array, start, partitionIndex - 1);
  quickSort(array, partitionIndex + 1, end);
}

int partition(List<int> array, var start, var end) {
  int pivot = array[end];
  int i = start - 1;

  for (int j = start; j < end; j++) {
    if (array[j] < pivot) {
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
