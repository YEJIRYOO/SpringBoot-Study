package com.mysite.sbb.jto_sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
//해당 속성 필요로 하는 생성자 롬복 의해 자동 생성
@Getter
@Setter
//애너테이션 이용
//setHello, setLombok, getHello, getLombok 등의 메서드 사용 가능
public class HelloLombok {

    private final String hello;
    private final int lombok;
    //final -> 한 번 설정한 값 변경 불가
    //=>Setter는 의미 x

    /*직접 생성자 작성의 경우
    public HelloLombok(String hello, int lombok){
        this.hello=hello;
        this.lombok=lombok;
    */

    public static void main (String[] args){
        HelloLombok helloLombok=new HelloLombok("헬로",5);
//        생성자 이용 객체 형성
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
        //return 값 필요
    }
}
