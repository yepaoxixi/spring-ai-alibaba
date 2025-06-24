package com.alibaba.cloud.ai.example.manus.tool;

import com.google.gson.*;
import org.junit.jupiter.api.Test;

public class HelloTest {
    public class OuterResponse {
        private OutputItem[] output;

        public OutputItem[] getOutput() {
            return output;
        }
    }

    public class OutputItem {
        private String text;

        public String getText() {
            return text;
        }
    }

    public class InnerData {
        private String userIntent;
        private String desc;

        public String getUserIntent() {
            return userIntent;
        }

        public String getDesc() {
            return desc;
        }
    }


    @Test
    public void hello() {
        String json = """
                {
                  "output" : "[{\\"text\\":\\"{\\\\\\"userIntent\\\\\\":\\\\\\"SOP\\\\\\",\\\\\\"desc\\\\\\":\\\\\\"1.通过业务诊断工具对比时间20240401、20240331数据;\\\\\\\\n2.如果消耗波动或转化波动或成本波动大于10%，那么依次调用任务波动分析工具、渠道波动分析工具、广告位波动分析工具、二级波动分析工具分析导致波动的原因，orderByType按需选择，默认使用转化uv;\\\\\\\\n3.终止分析并汇总贡献度和波动分析的结果并输出，需要展示必要的量级、波动率指标，并展示必要的维度，比如任务id、渠道、二级id。\\\\\\\\n\\\\\\"}\\"}]"
                }
                """;
        String outputArray = JsonParser.parseString(json).getAsJsonObject().get("output").getAsString();
        JsonArray asJsonArray = JsonParser.parseString(outputArray).getAsJsonArray();
        String text = asJsonArray.get(0).getAsJsonObject().get("text").getAsString();
        JsonObject jsonObject = JsonParser.parseString(text).getAsJsonObject();
        System.out.println(jsonObject);
    }

    @Test
    public void world() {

        String str = """
                "[{\\"text\\":\\"{\\\\\\"userIntent\\\\\\":\\\\\\"SOP\\\\\\",\\\\\\"desc\\\\\\":\\\\\\"1.通过业务诊断工具对比时间20240401、20240331数据;\\\\\\\\n2.如果消耗波动或转化波动或成本波动大于10%，那么依次调用任务波动分析工具、渠道波动分析工具、广告位波动分析工具、二级波动分析工具分析导致波动的原因，orderByType按需选择，默认使用转化uv;\\\\\\\\n3.终止分析并汇总贡献度和波动分析的结果并输出，需要展示必要的量级、波动率指标，并展示必要的维度，比如任务id、渠道、二级id。\\\\\\\\n\\\\\\"}\\"}]"
                """;

    }
}
