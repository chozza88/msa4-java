package com.msa4java.edu.erecord;
// 불변객체: 데이터의 값이 바뀌지 않는 객체
public record PostRecord(
        String title
        , String content
) {
    @Override
    public String toString(){
        return ("title: "+this.title+" , content: "+this.content);
    };
}
