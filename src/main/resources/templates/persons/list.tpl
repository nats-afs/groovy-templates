layout 'layout.tpl', title: 'Messages : View all',
        content: contents {
            div(class:'container') {
                div(class:'pull-right') {
                    a(href:'/?form', 'Create Message')
                }
                table(class:'table table-bordered table-striped') {
                    thead {
                        tr {
                            td 'Id'
                            td 'Name'
                            td 'Address'
                            td 'Email'
                        }
                    }
                    tbody {
                        if (persons.empty) { tr { td(colspan:'3', 'No Persons' ) } }
                        persons.each { person ->
                            tr {
                                td person.id
                                td person.name
                                td person.address
                                td person.email
                            }
                        }
                    }
                }
            }
        }