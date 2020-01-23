package us.diginc.jenkins.pipeline

import spock.lang.Specification

class BarSpec extends Specification {

    // https://github.com/ripley57/CW_Tools/blob/9a5a435baa8c1863582d3f2854473c3f93ad58b5/tools/java/spock/demo16/src/test/groovy/com/manning/chapter5/intro/GoodImageNameValidatorSpec.groovy

    Bar bar = null

    def setup() {
        bar = new Bar()
    }

    def "hmm"() {
        given:
//        def staticVar = 'Ouch'

        def env = [
                'VAR_ONE'   : "one",
                'GIT_COMMIT': 'a3bb4b7f9bf5db1c436b96a970c04d553feed1c5'
        ]

        when:

//        and:
        bar.setProperty("env", env)
        def value = bar.call("${dynamicVar}")

        then:
//        assert output == "${staticVar} ${dynamicVar}"
        value.toString() == "asdf"

        where:
        dynamicVar << ['world', 'demo', 'jenkins', 'pipelines']
    }
}
