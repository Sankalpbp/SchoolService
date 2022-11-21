'use strict'

const hitSchoolAPI = async () => {
    const studentName = document.getElementById ( 'studentName' ).value;

    const response = await fetch ( `http://localhost:9999/getFullStudentDetails?studentName=${studentName}` );
    const studentData = await response.json ();

    let ids = [
        'student-name',
        'roll-number',
        'class-number',
        'address',
        'parents-phone-number',
        'department-name',
        'department-hod',
        'department-numberOfStaffMembers'
    ];
    setDataInParagraphs ( studentData, ids );
}

const setDataInParagraphs = ( studentData, ids ) => {
    let staticText = null;
    let dynamicText = null;

    console.log (ids.length);
    for ( let iterator = 0; iterator < ids.length; ++iterator ) {
        switch ( ids[iterator] ) {
            case 'student-name':
                staticText = 'Student Name';
                dynamicText = studentData.studentName;
                break;

            case 'roll-number':
                staticText = 'Roll Number';
                dynamicText = studentData.rollNumber;
                break;
            
            case 'class-number':
                staticText = 'Class Number';
                dynamicText = studentData.classNumber;
                break;

            case 'address':
                staticText = 'Address';
                dynamicText = `House Number: ${studentData.address.houseNumber}, 
                               Road Number: ${studentData.address.roadNumber}, 
                               ${studentData.address.colony},
                               ${studentData.address.pinCode},
                               Near ${studentData.address.landmark}`;
                break;

            case 'parents-phone-number':
                staticText = 'Parent\'s phone number';
                dynamicText = studentData.parentsPhoneNumber;
                break;
            
            case 'department-name':
                staticText = 'Department Name';
                dynamicText = studentData.department.name;
                break;

            case 'department-hod':
                staticText = 'Department Head of Department';
                dynamicText = studentData.department.headOfDepartment;
                break;

            case 'department-numberOfStaffMembers':
                staticText = 'Number of members in the Department';
                dynamicText = studentData.department.numberOfStaffMembers;
                break;
        }
        document.getElementById ( ids[iterator] ).innerHTML = `${staticText}: ${dynamicText}`;
    }
}