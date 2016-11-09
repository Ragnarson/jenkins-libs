def call(version, command) {
  sh (
    script: "#!/bin/bash\nrbenv local ${version}\n${command}",
    returnStdout: true
  )
}
