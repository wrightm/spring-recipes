package com.github.wrightm.tutorials.spring.recipes.chpt2.springbeanconfig.basic.bean.init.containers;

import java.util.List;
import java.text.DecimalFormat;

public class SequenceGeneratorList {
    
	private String prefix;
    private List<Object> suffixes;
    private int initial;
    private int counter;
    
    public SequenceGeneratorList() {}
    
    public SequenceGeneratorList(String prefix, List<Object> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        DecimalFormat formatter = new DecimalFormat("0000");
	for (Object suffix : suffixes) {
            buffer.append("-");
	    buffer.append(formatter.format((Integer) suffix));
	}
        return buffer.toString();
    }
}
