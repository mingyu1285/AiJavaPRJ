package kopo.poly.service;

import kopo.poly.dto.NlpDTO;

public interface INlpService {
    /**
     * 분석할 문장의 형태소별 품사 분석 결과 가져오기
     *
     * @poram text 분석할 문장
     */

    NlpDTO getPlainText(String text);
    NlpDTO getNouns(String text);
}
