package com.github.seijuro

import org.apache.spark.{SparkConf, SparkContext}

object Main {
  def main(args: Array[String]): Unit = {
    val appName = "SparkTemplate"

    require(args.length >= 1, s"Usage : ${appName} master")

    val master = args(0)
    val conf = new SparkConf().setMaster(master).setAppName(appName)
    val sc = new SparkContext(conf)
  }
}
