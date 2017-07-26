package com.github.seijuro.nlp

import org.openkoreantext.processor.OpenKoreanTextProcessor

object KoreanParser {
  def extractNoun(text: String) = {
    val nomalized: CharSequence = OpenKoreanTextProcessor.normalize(text)

    OpenKoreanTextProcessor.tokenize(nomalized)
      .filter(NounFilter.filter)
      .map(a => a.text -> 1)
  }
}
