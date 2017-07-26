package com.github.seijuro.nlp

import com.twitter.penguin.korean.tokenizer.KoreanTokenizer.KoreanToken
import com.twitter.penguin.korean.util.KoreanPos

object NounFilter {
  def filter(token: KoreanToken): Boolean = {
    val pos = token.pos

    if (pos == KoreanPos.Noun ||
      pos == KoreanPos.Alpha) {
      return true
    }

    //  filter

    return false;
  }
}

