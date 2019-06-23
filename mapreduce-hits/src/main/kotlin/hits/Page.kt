package hits

class Page(val name: String) {
    private var authScore = 1.00
    private var hubScore = 1.00
    val outboundPages: MutableList<Page> = mutableListOf()
    val inboundPages: MutableList<Page> = mutableListOf()

    override fun toString(): String {
        return name
    }
}