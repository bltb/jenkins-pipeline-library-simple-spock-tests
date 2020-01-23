package us.diginc.jenkins.pipeline

import spock.lang.Specification

class MosquitoSpec extends Specification{

    // https://github.com/ripley57/CW_Tools/blob/9a5a435baa8c1863582d3f2854473c3f93ad58b5/tools/java/spock/demo16/src/test/groovy/com/manning/chapter5/intro/GoodImageNameValidatorSpec.groovy

    Mosquito mosquito = null

    def setup() {
        mosquito = new Mosquito()
    }
    def "bite me"() {
        given:
//        def staticVar = 'Ouch'
        def staticVar = 'What'

        when:
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        and:
        mosquito.biteMe()

        then:
//        assert output == "${staticVar} ${dynamicVar}"
        buffer.toString() == "${staticVar}"

//        where:
//        dynamicVar << ['world','demo','jenkins','pipelines']
    }
}
