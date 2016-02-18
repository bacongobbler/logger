job('deis-logger-tests') {
  disabled(true)
  scm {
    git {
      remote {
        github('deis/logger', 'https')
        branch('')
        credentials('597819a0-b0b9-4974-a79b-3a5c2322606d')
      }
    }
  }

  triggers {
      githubPush()
  }

  wrappers {
    timestamps()
    colorizeOutput 'xterm'
  }

  steps {
    shell """\
      make test
    """.stripIndent()
  }
}