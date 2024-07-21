package Exam.company1;
import java.util.Arrays;
public class Quest1 {

        public boolean solution(int[] arr) {
            boolean answer = true;
            Arrays.sort(arr); //순서대로 정렬시킨다. 1, 3, 4
            for(int i = 0; i<arr.length; i++){
                if(arr[i]!=i+1){ // 첫번째 배열에 값 확인 배열0번째값은 1
                    answer = false;
                    break;
                }
            }

            return answer;
        }
}
