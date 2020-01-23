package us.diginc.jenkins.pipeline

def call(String parameter) {
    if ((env.VAR_ONE == "one" &&
            env.VAR_TWO && env.VAR_TWO.trim() == "two"
    ) || env.VAR_THREE != "four") {

        return parameter
    } else {
        return parameter.replaceAll("asdf", "QWER")
    }
}
