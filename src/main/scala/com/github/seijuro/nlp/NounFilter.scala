package com.github.seijuro.nlp

import org.openkoreantext.processor.tokenizer.KoreanTokenizer.KoreanToken
import org.openkoreantext.processor.util.KoreanPos

object NounFilter {
  def filter(token: KoreanToken): Boolean = {
    val pos = token.pos

    if (pos == KoreanPos.Noun || pos == KoreanPos.Alpha) {
      return true
    }

    // (additional) filter

    return false;
  }
}

