package kr.ac.uos.composition;

import java.util.Arrays;

/**
 * <a href="https://tecoble.techcourse.co.kr/post/2020-05-18-inheritance-vs-composition/">상속보다는 조합(구상)을 사용하자.</a>
 */
public class WinnigLotto {
    private Lotto lotto;
    private final BonusBall bonusBall;


    public WinnigLotto(Lotto lotto, BonusBall bonusBall) {
        this.lotto = lotto;
        this.bonusBall = bonusBall;
    }

    public long compare(Lotto lotto) {
        return Arrays.stream(lotto.lottoNumbers).count();
    }
}
