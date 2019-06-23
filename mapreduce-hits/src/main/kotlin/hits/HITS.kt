package hits

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import org.apache.hadoop.io.DoubleWritable
import org.apache.hadoop.io.FloatWritable
import org.apache.hadoop.io.Text
import org.apache.hadoop.mapreduce.Job
import org.apache.hadoop.mapreduce.Mapper
import org.apache.hadoop.mapreduce.Reducer
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat
import java.io.File

object HITS {

    @JvmStatic
    fun main(args: Array<String>) {
        val conf = Configuration()
        val job = Job.getInstance(conf, "hits")
        job.setJarByClass(HITS::class.java)

    }

    class PageRankMapper : Mapper<Any, Text, Text, DoubleWritable>() {
        public override fun map(key: Any, value: Text, context: Context) {

        }
    }

    class PageRankReducer : Reducer<Text, DoubleWritable, Text, DoubleWritable>() {

    }
}