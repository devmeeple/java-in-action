package mid1.lang.math.test;

/**
 * // TODO: 2025-05-28 테스트 코드 및 구현
 * 문제5: 로또 번호 자동 생성기
 * 1) 로또 번호를 자동으로 만들어주는 자동 생성기 구현
 * 2) 로또 번호는 1~45까지의 숫자 6개를 뽑음
 * 3) 각 숫자는 중복되지 않음
 * 4) 실행할 때 마다 결과가 달라야 함
 */
public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
