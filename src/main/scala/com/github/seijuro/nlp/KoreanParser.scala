package com.github.seijuro.nlp

import com.twitter.penguin.korean.TwitterKoreanProcessor

object KoreanParser {
  def extractNoun(text: String) = {
    val nomalized: CharSequence = TwitterKoreanProcessor.normalize(text)

    TwitterKoreanProcessor.tokenize(nomalized)
      .filter(NounFilter.filter)
      .map(a => a.text -> 1)
  }
}
