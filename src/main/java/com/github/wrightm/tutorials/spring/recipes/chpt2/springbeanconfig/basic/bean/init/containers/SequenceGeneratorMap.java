package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.containers;

import java.util.Map;

public class SequenceGeneratorMap {
    private String prefix;
    private Map<Object, Object> suffixes;
    private int initial;
    private int counter;
    public SequenceGeneratorMap() {}
    public SequenceGeneratorMap(String prefix, Map<Object, Object> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffixes(Map<Object, Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        for (Map.Entry<Object, Object> entry : suffixes.entrySet()) {
            buffer.append("-");
            buffer.append(entry.getKey());
            buffer.append("@");
            buffer.append(entry.getValue());
        }
        return buffer.toString();
    }
}
