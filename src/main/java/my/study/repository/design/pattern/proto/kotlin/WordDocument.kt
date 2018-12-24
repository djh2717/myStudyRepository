package my.study.repository.design.pattern.proto.kotlin

/**
 * @author djh on  2018/11/28 17:11
 * @E-Mail 1544579459@qq.com
 */
class WordDocument : Cloneable {
    init {
        println("--------构造方法--------")
    }
    
    lateinit var text: String
    private var imageList = arrayListOf<String>()
    
    override fun clone(): WordDocument {
        val cloneDocument = super.clone() as WordDocument
        cloneDocument.text = text
        cloneDocument.imageList = imageList.clone() as ArrayList<String>
        return cloneDocument
    }
    
    fun addImage(image: String) {
        imageList.add(image)
    }
    
    fun showDocument() {
        println("--------DocumentStart--------")
        println("Text: $text")
        for (s in imageList) {
            println("Image: $s")
        }
        println("--------DocumentEnd--------")
    }
}