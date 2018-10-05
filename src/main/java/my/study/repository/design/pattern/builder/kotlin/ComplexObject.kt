package my.study.repository.design.pattern.builder.kotlin

/**
 * @author djh on  2018/10/3 20:15
 * @E-Mail 1544579459@qq.com
 */
class ComplexObject private constructor(builder: Builder) {

    val mAge: Int
    private var mSex: String
    private var mName: String
    private var mFatherName: String

    init {
        mAge = builder.mAge
        mSex = builder.mSex
        mName = builder.mName
        mFatherName = builder.mFatherName
    }


    class Builder {

        var mAge = 0
        var mSex = ""
        var mName = ""
        var mFatherName = ""

        fun setAge(age: Int): Builder {
            mAge = age
            return this
        }

        fun setSex(sex: String): Builder {
            mSex = sex
            return this
        }

        fun setName(name: String): Builder {
            mName = name
            return this
        }

        fun setFatherName(fatherName: String): Builder {
            mFatherName = fatherName
            return this
        }

        fun build(): ComplexObject {
            return ComplexObject(this)
        }

    }
}