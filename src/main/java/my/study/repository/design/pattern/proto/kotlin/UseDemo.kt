package my.study.repository.design.pattern.proto.kotlin

/**
 * @author djh on  2018/11/28 17:11
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val wordDocument = WordDocument()
        wordDocument.text = "文档1"
        wordDocument.addImage("Image-1")
        wordDocument.addImage("Image-2")
        wordDocument.addImage("Image-3")
        wordDocument.showDocument()
    }
}