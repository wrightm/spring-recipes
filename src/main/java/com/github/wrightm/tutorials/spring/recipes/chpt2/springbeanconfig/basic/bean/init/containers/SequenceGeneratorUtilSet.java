package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.containers;

import java.util.Set;

public class SequenceGeneratorUtilSet {
    private String prefix;
    private Set<Object> suffixes;
    private int initial;
    private int counter;
    public SequenceGeneratorUtilSet() {}
    
    public SequenceGeneratorUtilSet(String prefix, Set<Object> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffixes(Set<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
	for (Object suffix : suffixes) {
            buffer.append("-");
            buffer.append(suffix);
	}
        return buffer.toString();
    }
}
