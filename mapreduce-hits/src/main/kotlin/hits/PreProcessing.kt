package hits

import java.io.File

class PreProcessing {

    fun createPageList(pages:File): MutableMap<String, Page> {
        val pageMap = mutableMapOf<String,Page>()

        pages.forEachLine { line ->
            val inboundPage = Page(line.split("\t")[0])
            val outboundPage = Page(line.split("\t")[1])

            pageMap.putIfAbsent(inboundPage.toString(), inboundPage)
            inboundPage.outboundPages.add(outboundPage)
            outboundPage.inboundPages.add(inboundPage)
        }
        return pageMap
    }

    fun createHadoopImport(pageMap: MutableMap<String,Page>): File {
        val file = File("resources/formattedInput.txt")
        file.createNewFile()

        file.printWriter().use { out ->
            pageMap.forEach {(name,page) ->
//                val
            }
        }
        return file
    }

}